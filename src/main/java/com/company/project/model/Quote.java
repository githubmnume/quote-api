package com.company.project.model;

import javax.persistence.*;

public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String quotestart;

    private String quoteend;

    private Integer filmid;

    private String quote;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return quotestart
     */
    public String getQuotestart() {
        return quotestart;
    }

    /**
     * @param quotestart
     */
    public void setQuotestart(String quotestart) {
        this.quotestart = quotestart;
    }

    /**
     * @return quoteend
     */
    public String getQuoteend() {
        return quoteend;
    }

    /**
     * @param quoteend
     */
    public void setQuoteend(String quoteend) {
        this.quoteend = quoteend;
    }

    /**
     * @return filmid
     */
    public Integer getFilmid() {
        return filmid;
    }

    /**
     * @param filmid
     */
    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    /**
     * @return quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     * @param quote
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }
}