package life.male.community.pojo;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_id
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.token
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_create
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_moditify
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    private Long gmtModitify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_id
     *
     * @return the value of user.account_id
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_id
     *
     * @param accountId the value for user.account_id
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.token
     *
     * @return the value of user.token
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.token
     *
     * @param token the value for user.token
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_create
     *
     * @return the value of user.gmt_create
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_create
     *
     * @param gmtCreate the value for user.gmt_create
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_moditify
     *
     * @return the value of user.gmt_moditify
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public Long getGmtModitify() {
        return gmtModitify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_moditify
     *
     * @param gmtModitify the value for user.gmt_moditify
     *
     * @mbg.generated Mon Sep 02 01:09:43 CST 2019
     */
    public void setGmtModitify(Long gmtModitify) {
        this.gmtModitify = gmtModitify;
    }
}