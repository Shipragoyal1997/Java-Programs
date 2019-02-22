<?php
include_once 'resources/init.php';
if (isset($_POST['title'], $_POST['post'])) {
    $title = mysql_real_escape_string(htmlentities($_POST['title']));
    $post = mysql_real_escape_string(htmlentities($_POST['post']));

    mysql_query("INSERT INTO `posts` SET `title`='{$title}', `contents`='{$post}'") or die(mysql_error());
}

//$q = mysql_query("SELECT `contents` FROM `posts` WHERE `id` = 4") or die(mysql_error());
//$r = mysql_fetch_assoc($q);
//
//echo $r['contents'];
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Add a post</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
            label{
                display: block;
            }
        </style>
    </head>
    <body>
        <div id="main">
            <form method="POST" name="title" id="title" action="">
                <div>
                    <label for="title">Title:</label>
                    <input type="text" name="title" id="title">
                </div>
                <div>
                    <label for="post">Post:</label>
                    <textarea name="post" rows="15" cols="50"></textarea>
                </div>
                <div>
                    <input type="submit" value="Post">
                </div>
            </form>
        </div>
    </body>
</html>
