<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="pcoded-navbar">
	<div class="sidebar_toggle"><a href="#"><i class="icon-close icons"></i></a></div>
	<div class="pcoded-inner-navbar main-menu">
                            <div class="">
                            	<sec:authorize access="isAuthenticated()">
                                <div class="main-menu-header">
                                    <img class="img-80 img-radius" src="/resources/upload/profile/<sec:authentication property="principal.user.profileImage"/>" alt="User-Profile-Image">
                                    <div class="user-details">
                                        <span id="more-details"><sec:authentication property="principal.user.nick"/><i class="fa fa-caret-down"></i></span>
                                    </div>
                                </div>
                                </sec:authorize>

                                <div class="main-menu-content">
                                    <ul>
                                        <li class="more-details">
                                            <a href="user-profile.html"><i class="ti-user"></i>View Profile</a>
                                            <a href="#!"><i class="ti-settings"></i>Settings</a>
                                            <a href="auth-normal-sign-in.html"><i class="ti-layout-sidebar-left"></i>Logout</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="p-15 p-b-0">
                                <form class="form-material">
                                    <div class="form-group form-primary">
                                        <input type="text" name="footer-email" class="form-control" required="">
                                        <span class="form-bar"></span>
                                        <label class="float-label"><i class="fa fa-search m-r-10"></i>Search Friend</label>
                                    </div>
                                </form>
                            </div>
                            <div class="pcoded-navigation-label">Navigation</div>
                            <ul class="pcoded-item pcoded-left-item">
                                <li class="pcoded-hasmenu active pcoded-trigger">
                                    <a href="javascript:void(0)" class="waves-effect waves-dark">
                        <span class="pcoded-micon"><i class="ti-home"></i><b>D</b></span>
                        <span class="pcoded-mtext">Dashboard</span>
                        <span class="pcoded-mcaret"></span>
                      </a>
                                    <ul class="pcoded-submenu">
                                        <li class="active">
                                            <a href="index.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Default</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class="">
                                            <a href="dashboard-ecommerce.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Ecommerce</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class="">
                                            <a href="dashboard-crm.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">CRM</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="dashboard-analytics.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Analytics</span>
                            <span class="pcoded-badge label label-info ">NEW</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="dashboard-project.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Project</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="pcoded-hasmenu">
                                    <a href="javascript:void(0)" class="waves-effect waves-dark">
                        <span class="pcoded-micon"><i class="ti-layout"></i><b>P</b></span>
                        <span class="pcoded-mtext">Page layouts</span>
                        <span class="pcoded-badge label label-warning">NEW</span>
                        <span class="pcoded-mcaret"></span>
                      </a>
                                    <ul class="pcoded-submenu">
                                        <li class=" pcoded-hasmenu">
                                            <a href="javascript:void(0)" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="icon-pie-chart"></i></span>
                            <span class="pcoded-mtext">Vertical</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                            <ul class="pcoded-submenu">
                                                <li class=" ">
                                                    <a href="menu-static.html" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Static Layout</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                                <li class=" ">
                                                    <a href="menu-header-fixed.html" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Header Fixed</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                                <li class=" ">
                                                    <a href="menu-compact.html" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Compact</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                                <li class=" ">
                                                    <a href="menu-sidebar.html" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Sidebar Fixed</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class=" pcoded-hasmenu">
                                            <a href="javascript:void(0)" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="icon-pie-chart"></i></span>
                            <span class="pcoded-mtext">Horizontal</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                            <ul class="pcoded-submenu">
                                                <li class=" ">
                                                    <a href="menu-horizontal-static.html" target="_blank" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Static Layout</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                                <li class=" ">
                                                    <a href="menu-horizontal-fixed.html" target="_blank" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Fixed layout</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                                <li class=" ">
                                                    <a href="menu-horizontal-icon.html" target="_blank" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Static With Icon</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                                <li class=" ">
                                                    <a href="menu-horizontal-icon-fixed.html" target="_blank" class="waves-effect waves-dark">
                                <span class="pcoded-micon"><i class="icon-chart"></i></span>
                                <span class="pcoded-mtext">Fixed With Icon</span>
                                <span class="pcoded-mcaret"></span>
                              </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class=" ">
                                            <a href="menu-bottom.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="icon-pie-chart"></i></span>
                            <span class="pcoded-mtext">Bottom Menu</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="box-layout.html" target="_blank" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="icon-pie-chart"></i></span>
                            <span class="pcoded-mtext">Box Layout</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="menu-rtl.html" target="_blank" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="icon-pie-chart"></i></span>
                            <span class="pcoded-mtext">RTL</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="">
                                    <a href="navbar-light.html" class="waves-effect waves-dark">
                        <span class="pcoded-micon"><i class="ti-layout-cta-right"></i><b>N</b></span>
                        <span class="pcoded-mtext">Navigation</span>
                        <span class="pcoded-mcaret"></span>
                      </a>
                                </li>
                                <li class="pcoded-hasmenu">
                                    <a href="javascript:void(0)" class="waves-effect waves-dark">
                        <span class="pcoded-micon"><i class="ti-view-grid"></i><b>W</b></span>
                        <span class="pcoded-mtext">Widget</span>
                        <span class="pcoded-badge label label-danger">100+</span>
                        <span class="pcoded-mcaret"></span>
                      </a>
                                    <ul class="pcoded-submenu">
                                        <li class="">
                                            <a href="widget-statistic.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Statistic</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="widget-data.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Data</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="widget-chart.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Chart Widget</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                        <li class=" ">
                                            <a href="widget-chart-advance.html" class="waves-effect waves-dark">
                            <span class="pcoded-micon"><i class="ti-angle-right"></i></span>
                            <span class="pcoded-mtext">Advance Widgets</span>
                            <span class="pcoded-badge label label-info">25+</span>
                            <span class="pcoded-mcaret"></span>
                          </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                          
	</div>
</nav>