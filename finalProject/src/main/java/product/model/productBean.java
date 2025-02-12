package product.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "Product")
public class productBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	private String pName;
	private Integer pInstock;
	private Integer pPrice;
	private String pContent;
	private String pType;
	private String pArea;
	private Integer pPopular;
	private Integer pRating;
	private java.sql.Date pDateRange;
	private Double pAvgRating;
	private Blob pPicture;
	private String pFileName;
	@Transient
	@XmlTransient
	private MultipartFile productImage;

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public productBean() {

	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getpInstock() {
		return pInstock;
	}

	public void setpInstock(Integer pInstock) {
		this.pInstock = pInstock;
	}

	public Integer getpPrice() {
		return pPrice;
	}

	public void setpPrice(Integer pPrice) {
		this.pPrice = pPrice;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getpArea() {
		return pArea;
	}

	public void setpArea(String pArea) {
		this.pArea = pArea;
	}

	public Integer getpPopular() {
		return pPopular;
	}

	public void setpPopular(Integer pPopular) {
		this.pPopular = pPopular;
	}

	public Integer getpRating() {
		return pRating;
	}

	public void setpRating(Integer pRating) {
		this.pRating = pRating;
	}

	public java.sql.Date getpDateRange() {
		return pDateRange;
	}

	public void setpDateRange(java.sql.Date pDateRange) {
		this.pDateRange = pDateRange;
	}

	public Double getpAvgRating() {
		return pAvgRating;
	}

	public void setpAvgRating(Double pAvgRating) {
		this.pAvgRating = pAvgRating;
	}

	public productBean(Integer pId, String pName, Integer pInstock, Integer pPrice, String pContent, String pType,
			String pArea, Integer pPopular, Integer pRating, Date pDateRange, Double pAvgRating, Blob pPicture,
			String pFileName) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pInstock = pInstock;
		this.pPrice = pPrice;
		this.pContent = pContent;
		this.pType = pType;
		this.pArea = pArea;
		this.pPopular = pPopular;
		this.pRating = pRating;
		this.pDateRange = pDateRange;
		this.pAvgRating = pAvgRating;
		this.pPicture = pPicture;
		this.pFileName = pFileName;
	}

	public Blob getpPicture() {
		return pPicture;
	}

	public void setpPicture(Blob pPicture) {
		this.pPicture = pPicture;
	}

	public String getpFileName() {
		return pFileName;
	}

	public void setpFileName(String pFileName) {
		this.pFileName = pFileName;
	}

}
