package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Role {
	
	public Long roleId;
	public String roleName;
	public Set<Action> subActions;

}
