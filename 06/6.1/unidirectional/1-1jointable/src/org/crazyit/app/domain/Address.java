package org.crazyit.app.domain;

import java.util.*;

import javax.persistence.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
@Table(name="address_inf")
public class Address
{
	// ��ʶ����
	@Id @Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	// �����ַ��ϸ��Ϣ�ĳ�Ա����
	private String addressDetail;

	// �޲����Ĺ�����
	public Address()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Address(String addressDetail)
	{
		this.addressDetail = addressDetail;
	}

	// addressId��setter��getter����
	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}
	public int getAddressId()
	{
		return this.addressId;
	}

	// addressDetail��setter��getter����
	public void setAddressDetail(String addressDetail)
	{
		this.addressDetail = addressDetail;
	}
	public String getAddressDetail()
	{
		return this.addressDetail;
	}
}