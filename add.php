<html>
    <body>
        <form action="" method="POST">
            <input type="text" name="a">
            <input type="text" name="b">
            <input type="submit" name="submit">
        </form>
        <?php
        $a=$_POST["a"];
        $b=$_POST["b"];
        $result=$a+$b;
        echo "Addition=" .$result, "<br>";
        $result=$a-$b;
        echo "Substraction=" .$result, "<br>";
        $result=$a*$b;
        echo "Multiplication=" .$result, "<br>";
        $result=$a/$b;
        echo "Division=" .$result, "<br>";
        ?>
    </body>
</html>