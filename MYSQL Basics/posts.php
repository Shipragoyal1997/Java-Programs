<?php
include_once 'resources/init.php';
$query = mysql_query("SELECT `id`, `title`, `contents` FROM `posts`") or die(mysql_error());
echo 'Query for this output is. <h4>SELECT `id`, `title`, `contents` FROM `posts`</h4>';
while ($row = mysql_fetch_assoc($query)) {
    ?>
    <h2><a href='post.php?id<?php echo $row['id']; ?>'><?php echo $row['title']; ?></a></h2>
    <p><?php echo $row['contents']; ?></p>
    <?php
}

echo '<hr>';
echo 'Query for this output is. <h4>SELECT COUNT(1) FROM `posts`</h4>';
$query = mysql_query("SELECT COUNT(1) FROM `posts`") or die(mysql_error());
$counter = mysql_result($query, 0);
echo $counter;

echo '<hr>';
echo 'Query for this output is. <h4>SELECT DISTINCT `title` , `contents`FROM `posts`</h4>';
$query = mysql_query("SELECT DISTINCT `title` , `contents`FROM `posts`") or die(mysql_error());

while ($row = mysql_fetch_assoc($query)) {
    ?>
    <h2><a href='post.php'><?php echo $row['title']; ?></a></h2>
    <p><?php echo $row['contents']; ?></p>
    <?php
}
?>
