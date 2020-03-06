<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%ServletContext contextChucNang = getServletConfig().getServletContext();
    contextChucNang.setAttribute("chucNang", "Them");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Them tai khoan</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Insert Member</h2>
    <form class="form-horizontal" action="/admin/insertProduct" method="post">

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Name: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="name" placeholder="Enter Name">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Image: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="image" placeholder="Enter Image" >
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Detail: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="detail" placeholder="Enter Detail" >
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Price: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="price" placeholder="Enter Price" >
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Amount: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="amount" placeholder="Enter Amount" >
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Color: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="color" placeholder="Enter Color" >
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Tag: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="tag" placeholder="Enter Tag" >
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Status: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pwd" name="status" placeholder="Enter Status" >
            </div>
        </div>

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
                <button type="submit" class="btn btn-default">Insert</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>