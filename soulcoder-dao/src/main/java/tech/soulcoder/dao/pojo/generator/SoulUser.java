package tech.soulcoder.dao.pojo.generator;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table soul_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SoulUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column soul_user.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column soul_user.pwd
     *
     * @mbg.generated
     */
    private String pwd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column soul_user.id
     *
     * @return the value of soul_user.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column soul_user.id
     *
     * @param id the value for soul_user.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column soul_user.pwd
     *
     * @return the value of soul_user.pwd
     *
     * @mbg.generated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column soul_user.pwd
     *
     * @param pwd the value for soul_user.pwd
     *
     * @mbg.generated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}