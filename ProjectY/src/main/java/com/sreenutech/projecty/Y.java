package com.sreenutech.projecty;

import com.sreenutech.projecty.model.YReq;
import com.sreenutech.projecty.model.YResp;
import com.sreenutech.projectz.Z;
import com.sreenutech.projectz.model.ZReq;
import com.sreenutech.projectz.model.ZResp;

public class Y {
	public YResp m2(YReq yreq) {
		System.out.println("Entered into Y");

		// 1.get the request from X
		// 2.prepare the y request for Z

		ZReq zreq = new ZReq();

		zreq.setOid(yreq.getOid());
		zreq.setName(yreq.getName());
		zreq.setDesc(yreq.getDesc());

		// 3.create Z object , call Z and get the response
		Z z = new Z();
		ZResp zresp = z.m3(zreq);

		// 4.prepare the YResp with the help of ZResp
		YResp yresp = new YResp();
		yresp.setStatus(zresp.getStatus());
		System.out.println("Exit from  Y");

		return yresp;

	}

}
