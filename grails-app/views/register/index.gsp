<body>
<div class="col-sm-12">
    <div class="panel panel-primary">
        <div class="panel-heading">Register</div>

        <div class="panel-body">
            <g:uploadForm controller="register" action="register" method="post" enctype="multipart/form-data">
                <div class="form-group col-sm-12">

                    <label for="firstName">First Name*</label>
                    <input type="text" name="firstName" value="${firstName}" class="form-control" id="firstName"
                           placeholder="Enter First Name" required pattern="[A-Za-z]{2,10}"  title="Must contain 2-10 characters">
                </div>

                <div class="form-group col-sm-12">
                    <label for="lastName">Last Name*</label>
                    <input type="text" name="lastName" value="${lastName}" class="form-control" id="lastName"
                           placeholder="Enter last Name" required pattern="[A-Za-z]{1,10}"  title="Must contain 1-10 characters">
                </div>

                <div class="form-group col-sm-12">
                    <label for="email">Email*</label>
                    <input type="email" name="email" value="${email}" class="form-control" id="email"
                           placeholder="Enter Email" required>
                </div>

                <div class="form-group col-sm-12">
                    <label for="password">Password*</label>
                    <input type="password" name="password" value="${password}" class="form-control" id="password"
                           pattern="[A-Za-z]{5,10}"
                           title="Must contain 5-10 characters"
                           placeholder="Enter Password" required>
                </div>


                <div class="form-group col-sm-12">
                    <label for="password">Confirm Password*</label>
                    <input type="password" name="confirmPassword" value="${confirmPassword}" class="form-control" id="confirmPassword"
                           pattern="[A-Za-z]{5,10}"
                           title="Must contain 5-10 characters"
                           placeholder="Enter Password" required>
                </div>


                <div class="form-group col-sm-6">
                    <button type="submit" class="btn btn-primary"
                            style="float: right; margin-top: -30px;">Submit</button>
                </div>
                <div>${flash.message}</div>
            </g:uploadForm>
        </div>
    </div>
</div>
</body>



