<html>
  <link href = "styles.css" rel="stylesheet" type="text/css" />
<head>
    <!--Problem 1
Mackenzie Clarkson
Nov 4th 2016
-->
    <title>Problem 1</title>
</head>

<body>
    <form action = "" method='post' name="form1">
        <label>Mean
  <input type = "radio" name = "mean"/>
</label>
        <label>
Median
  <input type = "radio" name="median" />
</label>
        <input type="text" placeholder="Enter numbers" name = "nums" class="field">
        <input type="submit" value="Compute" name="comp" class="calc">
        <input type="reset" value="Reset" name='reset' class="calc">
    </form>

<?php
if(isset($_POST["mean"])){

  calculateMean(); //mean function

}
else if(isset($_POST["median"])){
  calculateMedian();
}
    function calculateMean(){
      $nums = $_POST["nums"]; //creating array, accounting for split
      $enums=(explode(" ",$nums));
      $sum = 0;
      $amount=count($enums); //counting amount of values
    foreach($enums as $n){ //totaling values
      $sum += $n;
      }
$mean= ($sum/$amount); //calculating mean
echo("Your mean is:" + $mean);
}
    function calculateMedian(){
      $nums = $_POST["nums"]; //initializing array
      $enums=(explode(" ",$nums));
      $amount=count($enums);//counting number of elements
      $medianLocation = floor($amount/2);//Getting median array element location
      sort($enums, SORT_NUMERIC); //sorting array in order
      $median = $enums[$medianLocation];
  if($amount %2==0){ //check if even
    $median = ($median + $enums[$medianLocation -1 ]) /2;

  }
  echo ("Your median is:" + $median);
}

 ?>
</body>


</html>
