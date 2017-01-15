<html>
  <link href = "styles.css" rel="stylesheet" type="text/css" />
<head>
    <!--Problem 2
Mackenzie Clarkson
Nov 4th 2016
-->
    <title>Problem 2</title>
</head>

<body>
    <form action = "" method='post' name="form1">

        <input type="text" placeholder="Enter words" name ="words" class="field">
        <input type="submit" value="Compute" name="comp" class="calc">
        <input type="reset" value="Reset" name='reset' class="calc">
    </form>

<?php
$array = array();
if(isset($_POST["words"])){
  countWords();
}
function countWords(){


$words = $_POST["words"]; //creating full string that will become array
$lcwords = strtolower($words); //making everything lowercase
$orgWords = explode(' ', $lcwords); //splitting up the array words into seperate element locations


  foreach($orgWords as $arrayScan){
    if(isset($array[$arrayScan])){
      $array[$arrayScan]++;
    }else{
      $array[$arrayScan] = 1;

    }

  }
printf("<pre>%s</pre>",print_r($array, true));
}
 ?>
</body>
</html>
