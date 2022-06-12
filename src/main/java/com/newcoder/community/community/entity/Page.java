package com.newcoder.community.community.entity;

import org.springframework.stereotype.Component;

/**
 * @author xyb
 * @create 2022-06-11 22:13
 */
@Component
public class Page {
    private int current = 1;
    private int limit = 10;
    private int rows;
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;}
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >=1 && limit <= 100){
        this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页面的起始行
     * 因为sql语句中，limit 参数是起始页，每页数量
     * @return
     */
    public int getOffset(){
        return (current - 1)*limit;
    }

    /**
     * 获取总的页数
     * @return
     */
    public int getTotal(){
        if(rows % limit == 0){
            return rows/limit;
        }else{
            return rows/limit + 1;
        }
    }

    /**
     * 获取起始页码
     * @return
     */
    public int getFrom(){
        int from = current - 2;
        return from >= 1? from:1;
    }

    /**
     * 获取结束页码
     * @return
     */
    public int getTo(){
        int to = current + 2;
        int total = getTotal();
        return to > total?total:to;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                ", path='" + path + '\'' +
                '}';
    }
}
