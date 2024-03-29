package practice03_Member;

public class Address {

  //field                                   aNumber   소문자첫글자뒤에바로대문자는피해야한다  
  private String postCode;
  private String roadAddress;
  private String jibunAddress;
  private String detailAddress;
  private String extraAddress;
  private boolean isBasicAddress;
  
  //constructor
  public Address() {
    // TODO Auto-generated constructor stub 
  }
  public Address(String postCode, String roadAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean isBasicAddress) {
    super();
    this.postCode = postCode;
    this.roadAddress = roadAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.isBasicAddress = isBasicAddress;
  }



  //method
  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
  public String getRoadAddress() {
    return roadAddress;
  }
  public void setRoadAddress(String roadAddress) {
    this.roadAddress = roadAddress;
  }
  public String getJibunAddress() {
    return jibunAddress;
  }
  public void setJibunAddress(String jibunAddress) {
    this.jibunAddress = jibunAddress;
  }
  public String getDetailAddress() {
    return detailAddress;
  }
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }
  public String getExtraAddress() {
    return extraAddress;
  }
  public void setExtraAddress(String extraAddress) {
    this.extraAddress = extraAddress;
  }

  public boolean isBasicAddress() { //boolean 은 get 일경우 is 로 시작
    return isBasicAddress;
  }

  public void setBasicAddress(boolean isBasicAddress) {
    this.isBasicAddress = isBasicAddress;
  }

  
  
  
  
  
}
