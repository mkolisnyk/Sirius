When /nop/ do
  SYS_CLIENT.get_current_user()
end
When /nop/ do
  SYS_CLIENT.get_date()
end
When /nop/ do
  SYS_CLIENT.get_environment_variable(value)
end
When /nop/ do
  SYS_CLIENT.get_free_disk_space()
end
When /nop/ do
  SYS_CLIENT.get_free_memory()
end
When /nop/ do
  SYS_CLIENT.get_machine_name()
end
When /nop/ do
  SYS_CLIENT.set_environment_variable(variable_name,value)
end
