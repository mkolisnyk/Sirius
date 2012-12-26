require 'sirius.rb'
resuire 'test/unit/assertions.rb'

@file_client = Sirius::Client::Core::System::FileOperations.new
@dir_client = Sirius::Client::Core::System::DirectoryOperations.new
@sys_client = Sirius::Client::Core::System::SystemOperations.new
