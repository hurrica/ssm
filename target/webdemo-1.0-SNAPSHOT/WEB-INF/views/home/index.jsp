<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<h2>Hello World!${message}</h2>
<script type="text/javascript">

    function upload() {
        alert("test");
        console.log("test");
        $("#uploadFormId").ajaxSubmit(function (result) {
            alert("上传成功")
        });
        return false;
    }
</script>

<form id="uploadFormId" method="post" action="/home/upload" enctype="multipart/form-data">
    选择一个文件:
    <input type="file" name="testFile" />
    <br/><br/>
    <input type="submit" value="上传" onclick="upload()"/>
</form>
</body>
</html>
