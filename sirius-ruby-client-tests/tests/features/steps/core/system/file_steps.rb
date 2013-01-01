#FILE_CLIENT.append(path,content)

When /nop/ do
  FILE_CLIENT.append_ex(path,text)
end
When /nop/ do
  FILE_CLIENT.copy(origin,destination)
end
When /nop/ do
  FILE_CLIENT.copy_ex(origin,destination,overwrite)
end
When /nop/ do
  FILE_CLIENT.create_file(file_name)
end
When /nop/ do
  FILE_CLIENT.create_file_ex(file_name,overwrite)
end
When /nop/ do
  FILE_CLIENT.delete_file(file_name)
end
When /nop/ do
  FILE_CLIENT.file_exists(file_name)
end
When /nop/ do
  FILE_CLIENT.get_file_contents(path)
end
When /nop/ do
  FILE_CLIENT.get_file_contents_ex(path,start)
end
When /nop/ do
  FILE_CLIENT.get_file_contents_ex2(path,start,number)
end
When /nop/ do
  FILE_CLIENT.head(path,lines)
end
When /nop/ do
  FILE_CLIENT.move(origin,destination)
end
When /nop/ do
  FILE_CLIENT.move_ex(origin,destination,overwrite)
end
When /nop/ do
  FILE_CLIENT.size(file_name)
end
When /nop/ do
  FILE_CLIENT.tail(path,lines)
end
When /nop/ do
  FILE_CLIENT.write(path,content)
end
When /nop/ do
  FILE_CLIENT.write_ex(path,text)
end
