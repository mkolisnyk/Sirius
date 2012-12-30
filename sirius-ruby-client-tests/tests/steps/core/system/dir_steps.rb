Given /the "$path" folder doesn't exist/ do |path|
  @dir_client.delete path
end

When /copy the "(.*)" folder to the "(.*)" location/ do |origin,destination|
  @dir_client.copy(origin,destination)
end

When /copy the "(.*)" folder to the "(.*)" location with(.*) overwrite/ do |origin,destination,overwrite|
  @dir_client.copy_ex(origin,destination,(overwrite=="out")?(true):(false))
end

When /create the "(.*)" folder/ do |path|
  @dir_client.create_directory(path)
end

When /create the "(.*)" folder with(.*) overwrite/ do |path,overwrite|
  @dir_client.create_directory_ex(path,overwrite)
end

When /delete the "(.*)" folder/ do
  @dir_client.delete(path)
end

When /move the "(.*)" folder to the "(.*)" location/ do
  @dir_client.move_directory(origin,destination)
end

When /move the "(.*)" folder to the "(.*)" location with(.*) overwrite/ do
  @dir_client.move_directory_ex(origin,destination,overwrite)
end

Then /the "(.*)" folder is {available|missing}/ do |path,flag| 
  assert_equals( flag = "available", @dir_client.exists(path) )
end

Then /the "(.*)" folder contains the following entries:/ do |path,table|
  @dir_client.get_contents(path)
end

Then /the "(.*)" folder \(including sub-folders\) contains the following entries:/ do |path,table|
  @dir_client.get_contents_ex(path,recursive)
end
