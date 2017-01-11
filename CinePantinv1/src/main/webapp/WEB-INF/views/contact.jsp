<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="entete.jsp"%>

		<div class="row">


			<div class="col-sm-2">
				<!-- zone menuLeft -->
	
				<%@include file="menuLeft.jsp"%>
			</div>

			<div class="col-sm-8">
				<!-- zone 2 (centrale) -->
<div class="container">
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>We love our fans!</em></p>
  <div class="row test">
   <div class="col-md-2">
      <p>Fan? Drop a note.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Paris, France</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +00 1515151515</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: zouhaier.gmail.com</p> 
    </div>
    <div class="col-md-6">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div> 
    </div>
  </div>
</div>


			</div>

			<div class="col-sm-2">
				<!-- zone menuRight -->
							
				<%@include file="menuRight.jsp"%>
			</div>

		</div>
     <div>
     <!-- zone menuPiedPage -->
 
		<%@include file="piedPage.jsp"%>
	</div>
</body>
</html>
