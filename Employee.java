package com.java.interview.Pojo; 
  
public class Employee { 
    private String serialNumber; 
    private String name; 
   private String noOfPort; 
   private String assetType; 
   
  
    public Employee() {} 
    // Constructor declaration 
    public Employee(String serialNumber, String name, String noOfPort, String assetType) 
    { 
        this.serialNumber = serialNumber; 
        this.name = name; 
        this.noOfPort = noOfPort;
        this.assetType = assetType;
    } 
    // generating getters and setters 
    public String getSerialNumber()  
    {  
      return serialNumber;  
    } 
  
    public void setSerialNumber(String serialNumber)  
    {  
      this.serialNumber = serialNumber;  
    } 
  
    public String getName()  
    {  
      return name;  
    } 
  
    public void setName(String name)  
    {  
      this.name = name;  
    } 
  
    public String getNoOfPort()  
    {  
      return noOfPort;  
    } 
  
    public void setNoOfPort(String noOfPort)  
    { 
      this.noOfPort = noOfPort;  
    } 

  public String getAssetType()  
    {  
      return assetType;  
    } 
  
    public void setAssetType(String assetType)  
    { 
      this.assetType = assetType;  
    } 
}
