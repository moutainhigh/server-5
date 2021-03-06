<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<!-- IE=edge告诉IE使用最新的引擎渲染网页 -->
<!-- chrome=1则可以激活Chrome Frame , Chrome Frame可以让旧版IE浏览器使用Chrome的WebKit渲染引擎处理网页 -->
<meta
	content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0"
	name="viewport">
<!-- 强制让文档的宽度与设备的宽度保持1:1，并且文档最大的宽度比例是1.0，且不允许用户点击屏幕放大浏览 -->

<meta content="yes" name="apple-mobile-web-app-capable" />
<!-- iphone设备中的safari私有meta标签，它表示：允许全屏模式浏览 -->

<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<!-- iphone的私有标签，它指定的iphone中safari顶端的状态条的样式 -->

<meta content="telephone=no" name="format-detection" />
<!-- 告诉设备忽略将页面中的数字识别为电话号码 -->

<meta content="email=no" name="format-detection" />
<!-- android设备忽略将页面中的email识别为电子邮箱 -->

<link rel="shortcut icon" href="/resources/img/common/favicon.ico"
	type="image/x-icon" />

<title>ERP管理系统</title>

<!-- 主体部分样式表 -->
<link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap/button.css">
<link rel="stylesheet" href="/resources/css/font-awesome.min.css">
<link rel="stylesheet" href="/resources/css/layout.css">
<link rel="stylesheet" href="/resources/css/ops.css">
<link rel="stylesheet" href="/resources/css/ops-addkol.css">
<link rel="stylesheet" href="/resources/css/sidebar.css">
<link rel="stylesheet" href="/resources/css/content-header.css">
<link rel="stylesheet" href="/resources/css/datapage.css">
<link rel="stylesheet" href="/resources/css/form.css">
<link rel="stylesheet" href="/resources/css/pagination.css">
<!-- 分页插件 css 样式 -->
<!-- 此部分注释内容兼容IE低版本 H5相关 **不要删除**-->
<!--[if lt IE 9]>
          <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>

<body>
	<section class="layout-wrap">
		<div class="layout-left">
			<%@ include file="/resources/html/sidebar.jsp"%>
		</div>
		<div class="layout-right">
			<div class="layout-right-inner">
				<div class="layout-right-top">
					<%@ include file="/resources/html/content_header.jsp"%>
				</div>
				<div class="layout-right-bottom">
					<!-- 
                            这部分写各自页面对应的内容
                            注意锁紧格式
                            范围 start -
                         -->
					<div class="data-page-wrap">
						<div class="data-page-inner">
							<div class="page-head">
								<!-- 页面标题 -->
								<h3 class="m-b-less">品牌管理</h3>
								<!--面包屑导航-->
								<div class="state-information">
									<ol class="breadcrumb m-b-less bg-less">
										<li><a href="#">主页</a></li>
										<li><a href="#">品牌管理</a></li>
										<li class="active">品牌编辑</li>
									</ol>
								</div>
							</div>
							<div class="wrapper">
								<div class="row">
									<div class="col-sm-12">
										<section class="panel">
											<header class="panel-heading ">
												品牌编辑 	
												<div class="back">											
												<a href="javascript :;" onclick="javascript :history.back(-1);" class="button button-primary button-raised button-small pull-right">
													返回
												</a>
												</div>
											</header>
											<div class="bops-pub-wrap-inner">

												<div class="bops-pub-body">
													<div class="bops-pub-param-body">

														<form action="" method="post" id="brandForm" name="myForm">
															<div class="bops-pub-param-header">
																<span class="bops-pub-param-title"> 品牌信息 </span>
															</div>
															<table class="bops-pub-param-table">
																<tbody>
																	<tr>
																		<th class="col-xs-2">品牌Id</th>
																		<td class="col-xs-4">${brand.brandId}</td>
																		<td style="vertical-align: top;"><input
																			type="text" name="brandId" value="${brand.brandId}"
																			id="brandId" style="display: none;" /></td>
																	</tr>
																	<tr>
																		<th class="col-xs-2">品牌名称</th>
																		<td class="col-xs-4">${brand.brandName}</td>
																		<td style="vertical-align: top;"></td>
																	</tr>
																	<tr>
																		<th class="col-xs-2">品牌所属地</th>
																		<td class="col-xs-4">${brand.brandArea}</td>
																		<td style="vertical-align: top;"></td>
																	</tr>
																	<tr>
																		<th class="col-xs-2">官方网站</th>
																		<td class="col-xs-4">${brand.brandWebsite}</td>
																		<td style="vertical-align: top;"></td>
																	</tr>
																	<tr>
																		<th class="col-xs-2">售后服务电话</th>
																		<td class="col-xs-2">${brand.afterPhone}</td>
																		<td style="vertical-align: top;"></td>
																	</tr>
																	<tr>
																		<th class="col-xs-2">品牌介绍</th>
																		<td class="col-xs-4">
																		<textarea disabled="disabled" name="brandDescriptionText" required cols="30" rows="2"
																			class="ng-pristine ng-untouched ng-invalid ng-invalid-required form-control">${brand.brandDescriptionText}</textarea>
																		</td>
																		<td style="vertical-align: top;"></td>
																	</tr>

																	<tr>
																		<th class="col-xs-2">品牌介绍图片</th>
																		<td class="col-xs-4">
																			<div id="imageUpload">
																				<!-- ngRepeat: img in imageList -->
																				<img alt="pic" style="width: 37%;" id="brandPicKey"
																					src="${imgUrl}${brand.brandPicKey}" /> 
																				<input type="text" id="fileName" name="brandPicKey"
																					style="visibility: hidden" />
																			</div>
																		</td>
																		<td style="vertical-align: top;"></td>
																	</tr>
																</tbody>
															</table>

															<div class="bops-pub-param-tips-line"
																style="margin: 14px 0;"></div>
															<div class="bops-pub-param-btnlist"></div>
														</form>
													</div>
												</div>
											</div>
										</section>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- 
                            这部分写各自页面对应的内容
                            注意锁紧格式
                            范围 end -
                         -->
				</div>
			</div>
		</div>
	</section>
	<!-- 在 body的最底部引入js文件且一定保持 jquery 在 bootstrap 之前引入 -->
	<script src="/resources/js/jquery/jquery-2.1.4.min.js"></script>
	<script src="/resources/js/bootstrap/bootstrap.min.js"></script>
	<script src="/resources/js/jquery/jquery.validate.js"></script>
	<script src="/resources/js/jquery/jquery-validate-message.js"></script>
	<!-- 侧面导航栏组件 js -->
	<script src="/resources/js/sidebar.js"></script>
	<script src="/resources/js/jquery.pagination.js"></script>
</body>
</html>