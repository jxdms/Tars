// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class ApplyTokenRequest {

	@TarsStructProperty(order = 1, isRequire = true)
	public TokenKey sKey = null;

	public TokenKey getSKey() {
		return sKey;
	}

	public void setSKey(TokenKey sKey) {
		this.sKey = sKey;
	}

	public ApplyTokenRequest() {
	}

	public ApplyTokenRequest(TokenKey sKey) {
		this.sKey = sKey;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(sKey);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ApplyTokenRequest)) {
			return false;
		}
		ApplyTokenRequest other = (ApplyTokenRequest) obj;
		return (
			TarsUtil.equals(sKey, other.sKey) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(sKey, 1);
	}

	static TokenKey cache_sKey;
	static { 
		cache_sKey = new TokenKey();
	}

	public void readFrom(TarsInputStream _is) {
		this.sKey = (TokenKey) _is.read(cache_sKey, 1, true);
	}

}
