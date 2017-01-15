<html>
  <link href = "styles.css" rel="stylesheet" type="text/css" />
<head>

    <!--Problem 3
Mackenzie Clarkson
Nov 4th 2016
-->
    <title>Problem 3</title>
</head>

<body>
    <form action = "" method='post' name="form1">
      <em>Choose your Programming Language</em>
    <br>
        <label>
          C++
          <input type = "checkbox" name="Check[0]" >
        </label>
        <br>
        <label>
          PHP
          <input type = "checkbox" name="Check[1]">
        </label>
        </br>
        <label>
          Java
          <input type = "checkbox" name="Check[2]">
        </label>
        <br>
        <label>
          Python
          <input type = "checkbox" name="Check[3]">
        </label>
      </br>
    </br>
        <input type="submit" value="Submit" name="Submit" class="calc">
        <input type="reset" value="Reset" name='reset' class='calc'>
    </form>

<?php

if(isset($_POST["Check"])){
  $langArray = $_POST["Check"];



if(isset($langArray[0])){
  $langArray[0]="C++";
}
if(isset($langArray[1])){
  $langArray[1]="PHP";
}
if(isset($langArray[2])){
  $langArray[2]="Java";
}
if(isset($langArray[3])){
  $langArray[3]="Python";
}

$amount = count($langArray);
echo 'Languages Selected: '.$amount;
echo '<table border = "3px">';
foreach($langArray as $i=>$amount){
  echo '<tr><td>'.$langArray[$i].'</td></tr>';
}
echo '</table>';
}
?>
