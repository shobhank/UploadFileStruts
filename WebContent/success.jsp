<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>File Upload Success</title>
</head>
<body>
You have successfully uploaded <s:property value="myfileUploadFileName"/>
And It has been successfully moved to <s:property value="destFilePath"/>
</body>
</html>