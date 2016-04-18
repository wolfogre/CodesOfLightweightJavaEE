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
@Embeddable
public class Name
	implements java.io.Serializable
{
	// ����first��Ա����
	@Column(name="person_firstname")
	private String first;
	// ����last��Ա����
	@Column(name="person_lastname")
	private String last;

	// �޲����Ĺ�����
	public Name()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Name(String first , String last)
	{
		this.first = first;
		this.last = last;
	}

	// first��setter��getter����
	public void setFirst(String first)
	{
		this.first = first;
	}
	public String getFirst()
	{
		return this.first;
	}

	// last��setter��getter����
	public void setLast(String last)
	{
		this.last = last;
	}
	public String getLast()
	{
		return this.last;
	}

	// ��дequals()����������first��last�����ж�
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == Name.class)
		{
			Name target = (Name)obj;
			return target.getFirst().equals(getFirst())
				&& target.getLast().equals(getLast());
		}
		return false;
	}
	// ��дhashCode()����������first��last����hashCodeֵ
	public int hashCode()
	{
		return getFirst().hashCode() * 31
			+ getLast().hashCode();
	}
}