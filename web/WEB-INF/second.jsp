
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp" />


<h1>Hello World! From second.jsp</h1>
<h1>Received</h1>
<h3>${student.fName}</h3>
<h3>${student.lName}</h3>

<h3>${student.laptop.model}</h3>

<c:if test="${message == true}">
    <h1>The message is true</h1>
</c:if>
            
            
<c:import url="/includes/footer.jsp" />