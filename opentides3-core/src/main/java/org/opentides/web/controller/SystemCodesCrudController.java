/*
   Licensed to the Apache Software Foundation (ASF) under one
   or more contributor license agreements.  See the NOTICE file
   distributed with this work for additional information
   regarding copyright ownership.  The ASF licenses this file
   to you under the Apache License, Version 2.0 (the
   "License"); you may not use this file except in compliance
   with the License.  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing,
   software distributed under the License is distributed on an
   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
   KIND, either express or implied.  See the License for the
   specific language governing permissions and limitations
   under the License.    
 */
package org.opentides.web.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.opentides.bean.SystemCodes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is the controller class for {@link SystemCodes}. It extends the
 * {@link BaseCrudController} class. Mapped to {@code /system/system-codes}.
 * Scaffold generated by opentides3 on Jan 16, 2013 12:40:25. 
 * @author opentides
 */
@RequestMapping("/system/system-codes")
@Controller 
public class SystemCodesCrudController extends BaseCrudController<SystemCodes> {

	/**
	 * Post construct that initializes the crud page to {@code "/base/system-codes-crud"}.
	 */
	@PostConstruct
	public void init() {
		singlePage = "/base/system-codes-crud";
	}
	
	/**
	 * Method stub that returns a list of all categories for the system codes.
	 * 
	 * @return list of system codes
	 */
	@ModelAttribute("categoryList")
	public List<String> categoryList() {
		return systemCodesService.getAllCategories();
	}
	
	/* (non-Javadoc)
	 * @see org.opentides.web.controller.BaseCrudController#onLoadSearch(org.opentides.bean.BaseEntity, org.springframework.validation.BindingResult, org.springframework.ui.Model, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	/**
	 * Method that adds to the model parameter {@code uiModel} the results {@code results} 
	 * of {@link BaseCrudController } search method.
	 */
	@Override
	protected void onLoadSearch(SystemCodes command, BindingResult bindingResult, 
			Model uiModel, HttpServletRequest request,
			HttpServletResponse response) {
		uiModel.addAttribute("results", search(command, request));
	}
}
