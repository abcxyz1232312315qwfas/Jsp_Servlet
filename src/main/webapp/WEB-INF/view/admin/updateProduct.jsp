<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.buiminhduc.util.MySqlConnectionUtil" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
    String id = request.getParameter("id");
%>
<div class="container">
    <h2>Update Product</h2>
    <form class="form-horizontal" action="/admin/updateProduct?id=<%=id%>" method="post">
        <%
            ResultSet rs = new MySqlConnectionUtil().chonDuLieuTuDTB("select * from sanpham where maSp="+id+" ");
            while(rs.next()){
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Name: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="" name="name" placeholder="Enter Name" value="<%
        	 	 out.print(rs.getString(2));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Image: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="" name="image" placeholder="Enter Image" value="<%
        	 	 out.print(rs.getString(3));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Detail: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="" name="detail" placeholder="Enter Detail" value="<%
        	 	 out.print(rs.getString(4));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Price: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="" name="price" placeholder="Enter Price" value="<%
        	 	 out.print(rs.getString(5));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Amount: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="amount" placeholder="Enter Amount" value="<%
        	 	 out.print(rs.getString(6));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Color: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="color" placeholder="Enter Color" value="<%
        	 	 out.print(rs.getString(7));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Tag: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="tag" placeholder="Enter Tag" value="<%
        	 	 out.print(rs.getString(8));
                %>">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Status: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="status" placeholder="Enter Status" value="<%
        	 	 out.print(rs.getString(9));
                %>">
            </div>
        </div>
        <%
            }
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Category: </label>
            <div class="col-sm-10">
                <select name="category">
                    <option value="1">Men</option>
                    <option value="2">Women</option>
                    <option value="3">Kids</option>
                    <option value="4">Shoes</option>
                    <option value="5">Bags</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Update</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>