<%@page import="java.util.Set"%>
<%@ page import="com.buiminhduc.repository.dao.ThanhVienDAO" %>
<%@ page import="com.buiminhduc.repository.dao.SanPhamDAO" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.7.1/modernizr.min.js"></script>
    <script>
        yepnope({
            test : (!Modernizr.input.list || (parseInt($.browser.version) > 400)),
            yep : [
                'https://raw2.github.com/CSS-Tricks/Relevant-Dropdowns/master/js/jquery.relevant-dropdown.js',
                'https://raw2.github.com/CSS-Tricks/Relevant-Dropdowns/master/js/load-fallbacks.js'
            ]
        });
    </script>
</head>
<body>
<form action="/searchproduct" method="get">
    <input type="text" name="namep" list="dsSanPham" placeholder="Search here ex. 'man' ">
    <button type="submit"><span class="fa fa-search"></span></button>
</form>
<%Set<String> dsSanPhamTheoTen = new SanPhamDAO().getDanhSachTheoTenSP();%>
<datalist id="dsSanPham">
    <%for(String a:dsSanPhamTheoTen) {%>
    <option value="<%=a%>"><%=a %></option>
    <%} %>
</datalist>
</body>
</html>
