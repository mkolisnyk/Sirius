require 'sirius.rb'
require 'test/unit/assertions.rb'

include Test::Unit::Assertions

FILE_CLIENT = Sirius::Client::Core::System::FileOperations.new
DIR_CLIENT = Sirius::Client::Core::System::DirectoryOperations.new
SYS_CLIENT = Sirius::Client::Core::System::SystemOperations.new
