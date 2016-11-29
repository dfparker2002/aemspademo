<%@include file="/libs/foundation/global.jsp" %><%
%><%@taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %><%
%><cq:defineObjects/><%
%><body>
 <div id="wrap">
  <div class="container">
    <div class="starter-template">
      <div class="header-wrapper">
        <div class="fcrllc logo"></div>
        <div class="intro">
          <h1>AEMSPA Demo</h1>
          <p class="lead">
              AEM Angular Demo
          </p>
        </div>
      </div>
      <cq:include resourceType="aemspademo/components/errormessage" path="errormessage"/>
      <cq:include resourceType="foundation/components/parsys" path="par"/>
    </div>
  </div>
  </div>
  <div id="footer">
    <div class="container">
        <p class="muted credit">
          Contact: 
            <a href="mailto:dfparker@aemintegrators.com">FirstCoastResearch, LLC</a>
        </p>
    </div>
  </div>
</body>