package demo.le.base.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.format.annotation.DateTimeFormat;

import dream.keel.base.BaseModel;

/**
 * 人员
 * @author Tykkidream
 *
 */
@XmlRootElement
public class Persion implements BaseModel<Persion>{

	private static final long serialVersionUID = 6890746001324455994L;

	private Long id;

    private String firstName;

    private String sex;

    private String telephone;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date birthDate;

    private String hometown;

    private String address;

    private String hatPhoto;

    private String code;

    private String lastName;

    @Override
    @XmlAttribute
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 姓
     * @return
     */
    @XmlAttribute
    public String getFirstName() {
        return firstName;
    }

    /**
     * 姓
     * @param firstName
     */
    public void setFirstName(String firstName) {
    	if (null != firstName) {
    		firstName = firstName.trim();
		}
        this.firstName = firstName;
    }

    /**
     * 性别
     * @return
     */
    @XmlAttribute
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex
     */
    public void setSex(String sex) {
    	if (null != sex) {
    		sex = sex.trim();
		}
        this.sex = sex;
    }

    /**
     * 电话
     * @return
     */
    @XmlAttribute
    public String getTelephone() {
        return telephone;
    }

    /**
     * 电话
     * @param telephone
     */
    public void setTelephone(String telephone) {
    	if (null != telephone) {
    		telephone = telephone.trim();
		}
        this.telephone = telephone;
    }

    /**
     * 生日
     * @return
     */
    @XmlAttribute
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 生日
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 籍贯
     * @return
     */
    @XmlAttribute
    public String getHometown() {
        return hometown;
    }

    /**
     * 籍贯
     * @param hometown
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * 地址
     * @return
     */
    @XmlAttribute
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 免冠照
     * @return
     */
    @XmlAttribute
    public String getHatPhoto() {
        return hatPhoto;
    }

    /**
     * 免冠照
     * @param hatPhoto
     */
    public void setHatPhoto(String hatPhoto) {
        this.hatPhoto = hatPhoto;
    }

    /**
     * 编码
     * @return
     */
    @XmlAttribute
    public String getCode() {
        return code;
    }

    /**
     * 编码
     * @param code
     */
    public void setCode(String code) {
    	if (null != code) {
    		code = code.trim();
		}
        this.code = code;
    }

    /**
     * 名
     * @return
     */
    @XmlAttribute
    public String getLastName() {
        return lastName;
    }

    /**
     * 名
     * @param lastName
     */
    public void setLastName(String lastName) {
    	if (null != lastName) {
    		lastName = lastName.trim();
		}
        this.lastName = lastName;
    }

	@Override
	@XmlTransient
	public String getName() {
		return this.getFirstName() + this.getLastName();
	}

	@Override
	public void setName(String name) {
		this.setLastName(name);
	}
}