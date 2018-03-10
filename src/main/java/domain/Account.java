package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Account implements Serializable{
   private Integer id;
   private String number;
   private String pwd;
   private Integer status;
   private Timestamp time;

   public Account() {
   }

   public Account(Integer id, String number, String pwd, Integer status, Timestamp time) {
      this.id = id;
      this.number = number;
      this.pwd = pwd;
      this.status = status;
      this.time = time;
   }

   public Account(String number, String pwd, Integer status, Timestamp time) {
      this.number = number;
      this.pwd = pwd;
      this.status = status;
      this.time = time;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public String getPwd() {
      return pwd;
   }

   public void setPwd(String pwd) {
      this.pwd = pwd;
   }

   public Integer getStatus() {
      return status;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Timestamp getTime() {
      return time;
   }

   public void setTime(Timestamp time) {
      this.time = time;
   }

   @Override
   public String toString() {
      return "Account{" +
              "id=" + id +
              ", number='" + number + '\'' +
              ", pwd='" + pwd + '\'' +
              ", status=" + status +
              ", time=" + time +
              '}';
   }
}
