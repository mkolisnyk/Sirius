require 'sirius.rb'
require 'test/unit/assertions.rb'

include Test::Unit::Assertions

@file_client = Sirius::Client::Core::System::FileOperations.new
@dir_client = Sirius::Client::Core::System::DirectoryOperations.new
@sys_client = Sirius::Client::Core::System::SystemOperations.new
