package com.tcs.sbi;

import com.ait.security.PwdSecService;

public class UserRegService {

	public static void main(String[] args) {
		
         PwdSecService pss=new PwdSecService();
        String encodedText= pss.encode("Mukesh");
        System.out.println(encodedText);
	}

}
