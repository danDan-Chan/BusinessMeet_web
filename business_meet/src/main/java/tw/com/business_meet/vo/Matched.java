package tw.com.business_meet.vo;
// Generated 2020/3/24 �U�� 07:27:15 by Hibernate Tools 5.2.12.Final

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

/**
 * Matched generated by hbm2java
 */
@Entity
@Table(name = "matched", schema = "dbo", catalog = "business_meet")
public class Matched implements java.io.Serializable {

	private Integer MSno;
	private UserInformation userInformationByMatchedBlueTooth;
	private UserInformation userInformationByBlueTooth;
	private String memorandum;
	private Date createDate;
	private Date modifyDate;

	public Matched() {
	}

	public Matched(Integer MSno, UserInformation userInformationByMatchedBlueTooth, UserInformation userInformationByBlueTooth, String memorandum, Date createDate, Date modifyDate) {
		this.MSno = MSno;
		this.userInformationByMatchedBlueTooth = userInformationByMatchedBlueTooth;
		this.userInformationByBlueTooth = userInformationByBlueTooth;
		this.memorandum = memorandum;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "m_sno", unique = true, nullable = false)
	public Integer getMSno() {
		return this.MSno;
	}

	public void setMSno(Integer MSno) {
		this.MSno = MSno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matched_blue_tooth")
	public UserInformation getUserInformationByMatchedBlueTooth() {
		return this.userInformationByMatchedBlueTooth;
	}

	public void setUserInformationByMatchedBlueTooth(UserInformation userInformationByMatchedBlueTooth) {
		this.userInformationByMatchedBlueTooth = userInformationByMatchedBlueTooth;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "blue_tooth")
	public UserInformation getUserInformationByBlueTooth() {
		return this.userInformationByBlueTooth;
	}

	public void setUserInformationByBlueTooth(UserInformation userInformationByBlueTooth) {
		this.userInformationByBlueTooth = userInformationByBlueTooth;
	}

	@Column(name = "memorandum", length = 1000)
	public String getMemorandum() {
		return this.memorandum;
	}

	public void setMemorandum(String memorandum) {
		this.memorandum = memorandum;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date", length = 19)
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}