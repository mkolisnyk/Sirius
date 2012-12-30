#@file_client.append(path,content)

When // do
  @file_client.append_ex(path,text)
end
When // do
  @file_client.copy(origin,destination)
end
When // do
  @file_client.copy_ex(origin,destination,overwrite)
end
When // do
  @file_client.create_file(file_name)
end
When // do
  @file_client.create_file_ex(file_name,overwrite)
end
When // do
  @file_client.delete_file(file_name)
end
When // do
  @file_client.file_exists(file_name)
end
When // do
  @file_client.get_file_contents(path)
end
When // do
  @file_client.get_file_contents_ex(path,start)
end
When // do
  @file_client.get_file_contents_ex2(path,start,number)
end
When // do
  @file_client.head(path,lines)
end
When // do
  @file_client.move(origin,destination)
end
When // do
  @file_client.move_ex(origin,destination,overwrite)
end
When // do
  @file_client.size(file_name)
end
When // do
  @file_client.tail(path,lines)
end
When // do
  @file_client.write(path,content)
end
When // do
  @file_client.write_ex(path,text)
end
