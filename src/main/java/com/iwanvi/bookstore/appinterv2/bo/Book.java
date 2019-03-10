package com.iwanvi.bookstore.appinterv2.bo;

import com.iwanvi.bookstore.appinterv2.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Description  图书实体
 * @Author zzw
 * @Date 2018年8月11日14:28:59
 */
@ApiModel(value="图书信息")
public class Book extends BaseEntity {

    @ApiModelProperty(value="主键ID")
    private Long id;
    @ApiModelProperty(value="图书ID")
    private String bookId;
    @ApiModelProperty(value="书名")
    private String bookName;
    @ApiModelProperty(value="自定义书名")
    private String newBookName;
    @ApiModelProperty(value="书籍分明URL")
    private String imgUrl;
    @ApiModelProperty(value="书籍简介")
    private String introduction;
    @ApiModelProperty(value="字数")
    private Integer wordCount;
    @ApiModelProperty(value="分类ID")
    private Integer catId;
    @ApiModelProperty(value="二级分类ID")
    private Integer catSec;
    @ApiModelProperty(value="三级分类ID")
    private Integer catThr;
    @ApiModelProperty(value="笔名")
    private String PenName;
    @ApiModelProperty(value="关键词")
    private String keyWord;
    @ApiModelProperty(value="出版社")
    private String publish;
    @ApiModelProperty(value="是否有卷 0-没有 1-有")
    private Integer haveVolume;
    @ApiModelProperty(value="渠道")
    private Integer channel;
    @ApiModelProperty(value="价格")
    private Float bookPrice;
    @ApiModelProperty(value="创建时间")
    private Date createDate;
    @ApiModelProperty(value="修改时间")
    private Date updateDate;
    @ApiModelProperty(value="版权到期时间")
    private Date copyRightTime;
    @ApiModelProperty(value="最后章节更新时间")
    private Date lastUpChaDate;
    @ApiModelProperty(value="最后更新章节名称")
    private String lastUpChaName;
    @ApiModelProperty(value="最后更新章节ID")
    private Long lastUpChaId;
    @ApiModelProperty(value="频道id 0默认 1 男 2 女 3 出版物")
    private Integer pindaoId;
    @ApiModelProperty(value="状态：大于0在线")
    private Integer status;
    @ApiModelProperty(value="书籍状态：01是连载，02是暂停，03是完本")
    private String bookStatue;
    @ApiModelProperty(value="买断 1非买断 0买断")
    private Integer maiduan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNewBookName() {
        return newBookName;
    }

    public void setNewBookName(String newBookName) {
        this.newBookName = newBookName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getCatSec() {
        return catSec;
    }

    public void setCatSec(Integer catSec) {
        this.catSec = catSec;
    }

    public Integer getCatThr() {
        return catThr;
    }

    public void setCatThr(Integer catThr) {
        this.catThr = catThr;
    }

    public String getPenName() {
        return PenName;
    }

    public void setPenName(String penName) {
        PenName = penName;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Integer getHaveVolume() {
        return haveVolume;
    }

    public void setHaveVolume(Integer haveVolume) {
        this.haveVolume = haveVolume;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCopyRightTime() {
        return copyRightTime;
    }

    public void setCopyRightTime(Date copyRightTime) {
        this.copyRightTime = copyRightTime;
    }

    public Date getLastUpChaDate() {
        return lastUpChaDate;
    }

    public void setLastUpChaDate(Date lastUpChaDate) {
        this.lastUpChaDate = lastUpChaDate;
    }

    public String getLastUpChaName() {
        return lastUpChaName;
    }

    public void setLastUpChaName(String lastUpChaName) {
        this.lastUpChaName = lastUpChaName;
    }

    public Long getLastUpChaId() {
        return lastUpChaId;
    }

    public void setLastUpChaId(Long lastUpChaId) {
        this.lastUpChaId = lastUpChaId;
    }

    public Integer getPindaoId() {
        return pindaoId;
    }

    public void setPindaoId(Integer pindaoId) {
        this.pindaoId = pindaoId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBookStatue() {
        return bookStatue;
    }

    public void setBookStatue(String bookStatue) {
        this.bookStatue = bookStatue;
    }

    public Integer getMaiduan() {
        return maiduan;
    }

    public void setMaiduan(Integer maiduan) {
        this.maiduan = maiduan;
    }
}
