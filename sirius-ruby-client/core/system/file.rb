require 'savon'

module Sirius
  module Client
    module Core
      module System
        class FileOperations
          attr_accessor(:host, :port, :client)
          def initialize(host = "localhost",port="21212")
            @host = host
            @port = port

            @client = Savon.client do |wsdl|
              wsdl.endpoint = "http://#{@host}:#{@port}/system/file?wsdl"
              wsdl.namespace = "http://system.server.sirius.org/"
            end
          end

          def append_ex(path,text)
            response = @client.request :sys, "appendEx" do
              soap.body = {
                :path => path,
                :text => text,

              }
            end
            response.to_hash[:append_ex_response][:status]
          end

          def copy_ex(origin,destination,overwrite)
            response = @client.request :sys, "copyEx" do
              soap.body = {
                :origin => origin,
                :destination => destination,
                :overwrite => overwrite,

              }
            end
            response.to_hash[:copy_ex_response][:status]
          end

          def create_file(file_name)
            response = @client.request :sys, "createFile" do
              soap.body = {
                :file_name => file_name,

              }
            end
            response.to_hash[:create_file_response][:status]
          end

          def get_file_contents(path)
            response = @client.request :sys, "getFileContents" do
              soap.body = {
                :path => path,

              }
            end
            response.to_hash[:get_file_contents_response][:content]
          end

          def get_file_contents_ex2(path,start,number)
            response = @client.request :sys, "getFileContentsEx2" do
              soap.body = {
                :path => path,
                :start => start,
                :number => number,

              }
            end
            response.to_hash[:get_file_contents_ex2_response][:content]
          end

          def get_file_contents_ex(path,start)
            response = @client.request :sys, "getFileContentsEx" do
              soap.body = {
                :path => path,
                :start => start,

              }
            end
            response.to_hash[:get_file_contents_ex_response][:content]
          end

          def create_file_ex(file_name,overwrite)
            response = @client.request :sys, "createFileEx" do
              soap.body = {
                :file_name => file_name,
                :overwrite => overwrite,

              }
            end
            response.to_hash[:create_file_ex_response][:status]
          end

          def delete_file(file_name)
            response = @client.request :sys, "deleteFile" do
              soap.body = {
                :file_name => file_name,

              }
            end
            response.to_hash[:delete_file_response][:status]
          end

          def file_exists(file_name)
            response = @client.request :sys, "fileExists" do
              soap.body = {
                :file_name => file_name,
              }
            end
            response.to_hash[:file_exists_response][:status]
          end

          def get_all_bytes(file_name)
            response = @client.request :sys, "getAllBytes" do
              soap.body = {
                :file_name => file_name,

              }
            end
            response.to_hash[:get_all_bytes_response][:content]
          end

          def move_ex(origin,destination,overwrite)
            response = @client.request :sys, "moveEx" do
              soap.body = {
                :origin => origin,
                :destination => destination,
                :overwrite => overwrite,

              }
            end
            response.to_hash[:move_ex_response][:status]
          end

          def write_ex(path,text)
            response = @client.request :sys, "writeEx" do
              soap.body = {
                :path => path,
                :text => text,

              }
            end
            response.to_hash[:write_ex_response][:status]
          end

          def append(path,content)
            response = @client.request :sys, "append" do
              soap.body = {
                :path => path,
                :content => content,

              }
            end
            response.to_hash[:append_response][:status]
          end

          def size(file_name)
            response = @client.request :sys, "size" do
              soap.body = {
                :file_name => file_name,

              }
            end
            response.to_hash[:size_response][:fileSize]
          end

          def write(path,content)
            response = @client.request :sys, "write" do
              soap.body = {
                :path => path,
                :content => content,

              }
            end
            response.to_hash[:write_response][:status]
          end

          def copy(origin,destination)
            response = @client.request :sys, "copy" do
              soap.body = {
                :origin => origin,
                :destination => destination,

              }
            end
            response.to_hash[:copy_response][:status]
          end

          def head(path,lines)
            response = @client.request :sys, "head" do
              soap.body = {
                :path => path,
                :lines => lines,

              }
            end
            response.to_hash[:head_response][:content]
          end

          def tail(path,lines)
            response = @client.request :sys, "tail" do
              soap.body = {
                :path => path,
                :lines => lines,

              }
            end
            response.to_hash[:tail_response][:content]
          end

          def move(origin,destination)
            response = @client.request :sys, "move" do
              soap.body = {
                :origin => origin,
                :destination => destination,

              }
            end
            response.to_hash[:move_response][:status]
          end

        end
      end
    end
  end
end

client = Sirius::Client::Core::System::File.new

puts( client.exists?("D:\\Work\\Sirius\\BuildFlow.png") )
puts( client.exists?("D:\\Work\\Sirius\\BuildFlow23.png") )