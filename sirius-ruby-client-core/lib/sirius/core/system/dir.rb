require 'savon'

module Sirius
  module Client
    module Core
      module System
        class DirectoryOperations
          attr_accessor(:host, :port, :client)
          def initialize(host = 'localhost', port = '21212' )
            @host = host
            @port = port

            @client = Savon.client do |wsdl|
              wsdl.endpoint("http://#{@host}:#{@port}/system/file?wsdl")
              wsdl.namespace('http://system.server.sirius.org/')
            end
          end

          def copy_ex(origin, destination, overwrite)
            response = @client.request :sys, 'copyEx' do
              soap.body = {
                :origin => origin,
                :destination => destination,
                :overwrite => overwrite,

              }
            end
            response.to_hash[:copy_ex_response][:status]
          end

          def create_directory_ex(path,overwrite)
            response = @client.request :sys, "createDirectoryEx" do
              soap.body = {
                :path => path,
                :overwrite => overwrite,

              }
            end
            response.to_hash[:create_directory_ex_response][:status]
          end

          def get_contents_ex(path,recursive)
            response = @client.request :sys, "getContentsEx" do
              soap.body = {
                :path => path,
                :recursive => recursive,

              }
            end
            response.to_hash[:get_contents_ex_response][:contents]
          end

          def move_directory(origin,destination)
            response = @client.request :sys, "moveDirectory" do
              soap.body = {
                :origin => origin,
                :destination => destination,

              }
            end
            response.to_hash[:move_directory_response][:status]
          end

          def move_directory_ex(origin,destination,overwrite)
            response = @client.request :sys, "moveDirectoryEx" do
              soap.body = {
                :origin => origin,
                :destination => destination,
                :overwrite => overwrite,

              }
            end
            response.to_hash[:move_directory_ex_response][:status]
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

          def delete(path)
            response = @client.request :sys, "delete" do
              soap.body = {
                :path => path,

              }
            end
            response.to_hash[:delete_response][:status]
          end

          def exists(path)
            response = @client.request :sys, "exists" do
              soap.body = {
                :path => path,

              }
            end
            response.to_hash[:exists_response][:status]
          end

          def create_directory(path)
            response = @client.request :sys, "createDirectory" do
              soap.body = {
                :path => path,

              }
            end
            response.to_hash[:create_directory_response][:status]
          end

          def get_contents(path)
            response = @client.request :sys, "getContents" do
              soap.body = {
                :path => path,

              }
            end
            response.to_hash[:get_contents_response][:contents]
          end
        end
      end
    end
  end
end