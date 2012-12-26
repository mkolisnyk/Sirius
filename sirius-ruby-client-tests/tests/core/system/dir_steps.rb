Given /the "(.*)" is (.*)/ do |path,available|
  if available == "available"
    When "I create the \"#{path}\" folder with overwrite" unless @dir_client.exists(path)
  else
    When "I delete the \"#{path}\" folder"
  end
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

Then /the "(.*)" folder is(.*) available/ do |path,flag| 
  @dir_client.exists(path)
end

Then /the "(.*)" folder contains the following entries:/ do |path,table|
  @dir_client.get_contents(path)
end

Then /the "(.*)" folder \(including sub-folders\) contains the following entries:/ do |path,table|
  @dir_client.get_contents_ex(path,recursive)
end
