package com.student.base.execption;

public class StudentPlusException extends RuntimeException {

   private String errMessage;

   public StudentPlusException() {
      super();
   }

   public StudentPlusException(String errMessage) {
      super(errMessage);
      this.errMessage = errMessage;
   }

   public String getErrMessage() {
      return errMessage;
   }

   public static void cast(CommonError commonError){
       throw new StudentPlusException(commonError.getErrMessage());
   }
   public static void cast(String errMessage){
       throw new StudentPlusException(errMessage);
   }

}