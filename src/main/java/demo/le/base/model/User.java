package demo.le.base.model;

import java.util.Date;

import tykkidream.keel.base.BaseModel;


/**
 * 用户
 * @author Tykkidream
 *
 */
public class User implements BaseModel<User>{

	private static final long serialVersionUID = 2650804956883726819L;

	private Long id;

    private String username;

    private String nickname;

    private String password;

    private Long status;

    private Date registerDate;

    private Date previousDate;

    private String previousIp;

    private Date lastDate;

    private String lastIp;

    private Date securityDate;

    private String securityIp;

    private Long securityNumber;

    private String code;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username
     */
    public void setUsername(String username) {
    	if (null != username) {
            this.username = username.trim();
		}
    }

    /**
     * 昵称
     * @return
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 昵称
     * @param nickname
     */
    public void setNickname(String nickname) {
    	if (null != nickname) {
            this.nickname = nickname.trim();
		}
    }

    /**
     * 密码
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password
     */
    public void setPassword(String password) {
    	if (null != nickname) {
            this.password = password.trim();
		}
    }

    /**
     * 状态
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 注册时间
     * @return
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * 注册时间
     * @param registerDate
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * 上一次登录的时间
     * @return
     */
    public Date getPreviousDate() {
        return previousDate;
    }

    /**
     * 上一次登录的时间
     * @param previousDate
     */
    public void setPreviousDate(Date previousDate) {
        this.previousDate = previousDate;
    }

    /**
     * 上一次登录的IP
     * @return
     */
    public String getPreviousIp() {
        return previousIp;
    }

    /**
     * 上一次登录的IP
     * @param previousIp
     */
    public void setPreviousIp(String previousIp) {
        this.previousIp = previousIp;
    }

    /**
     * 最后一次登录的时间
     * @return
     */
    public Date getLastDate() {
        return lastDate;
    }

    /**
     * 最后一次登录的时间
     * @param lastDate
     */
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    /**
     * 最后一次登录的IP
     * @return
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 最后一次登录的IP
     * @param lastIp
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    /**
     * 安全登录限制时间
     * @return
     */
    public Date getSecurityDate() {
        return securityDate;
    }

    /**
     * 安全登录限制时间
     * @param securityDate
     */
    public void setSecurityDate(Date securityDate) {
        this.securityDate = securityDate;
    }

    /**
     * 安全登录时的IP
     * @return
     */
    public String getSecurityIp() {
        return securityIp;
    }

    /**
     * 安全登录时的IP
     * @param securityIp
     */
    public void setSecurityIp(String securityIp) {
        this.securityIp = securityIp;
    }

    /**
     * 安全登录限制次数
     * @return
     */
    public Long getSecurityNumber() {
        return securityNumber;
    }

    /**
     * 安全登录限制次数
     * @param securityNumber
     */
    public void setSecurityNumber(Long securityNumber) {
        this.securityNumber = securityNumber;
    }

    /**
     * 编码
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * 编码
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

	@Override
	public String getName() {
		return this.getUsername();
	}

	@Override
	public void setName(String name) {
		this.setUsername(name);
	}
}