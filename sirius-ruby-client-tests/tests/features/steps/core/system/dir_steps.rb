Given /the "(.*)" folder doesn't exist/ do |path|
  DIR_CLIENT.delete path
end

When /copy the "(.*)" folder to the "(.*)" location/ do |origin,destination|
  DIR_CLIENT.copy(origin,destination)
end

When /copy the "(.*)" folder to the "(.*)" location with(.*) overwrite/ do |origin,destination,overwrite|
  DIR_CLIENT.copy_ex(origin,destination,(overwrite=="out")?(true):(false))
end

When /create the "(.*)" folder/ do |path|
  DIR_CLIENT.create_directory(path)
end

When /create the "(.*)" folder with(.*) overwrite/ do |path,overwrite|
  DIR_CLIENT.create_directory_ex(path,overwrite)
end

When /delete the "(.*)" folder/ do
  DIR_CLIENT.delete(path)
end

When /move the "(.*)" folder to the "(.*)" location/ do
  DIR_CLIENT.move_directory(origin,destination)
end

When /move the "(.*)" folder to the "(.*)" location with(.*) overwrite/ do
  DIR_CLIENT.move_directory_ex(origin,destination,overwrite)
end

Then /the "(.*)" folder is (available|missing)/ do |path,flag| 
  assert_equals( flag = "available", DIR_CLIENT.exists(path) )
end

Then /the "(.*)" folder contains the following entries:/ do |path,table|
  DIR_CLIENT.get_contents(path)
end

Then /the "(.*)" folder \(including sub-folders\) contains the following entries:/ do |path,table|
  DIR_CLIENT.get_contents_ex(path,recursive)
end
