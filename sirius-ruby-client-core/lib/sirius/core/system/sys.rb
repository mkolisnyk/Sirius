require 'savon'

module Sirius
  module Client
    module Core
      module System
        class SystemOperations
          attr_accessor(:host, :port, :client)
          def initialize(host = "localhost",port="21212")
            @host = host
            @port = port

            @client = Savon.client do |wsdl|
              wsdl.endpoint("http://#{@host}:#{@port}/system/file?wsdl")
              wsdl.namespace("http://system.server.sirius.org/")
            end
          end

          def get_environment_variable(value)
            response = @client.request :sys, "getEnvironmentVariable" do
              soap.body = {
                :value => value
              }
            end
            response.to_hash[:get_environment_variable_response][:value]
          end

          def set_environment_variable(variable_name,value)
            response = @client.request :sys, "setEnvironmentVariable" do
              soap.body = {
                :variable_name => variable_name,
                :value => value,

              }
            end
            response.to_hash[:set_environment_variable_response][:status]
          end

          def get_machine_name()
            response = @client.request :sys, "getMachineName" do
              soap.body = {

              }
            end
            response.to_hash[:get_machine_name_response][:machine]
          end

          def get_free_memory()
            response = @client.request :sys, "getFreeMemory" do
              soap.body = {

              }
            end
            response.to_hash[:get_free_memory_response][:freeMemory]
          end

          def get_free_disk_space()
            response = @client.request :sys, "getFreeDiskSpace" do
              soap.body = {

              }
            end
            response.to_hash[:get_free_disk_space_response][:freeDiskSpace]
          end

          def get_current_user()
            response = @client.request :sys, "getCurrentUser" do
              soap.body = {

              }
            end
            response.to_hash[:get_current_user_response][:userName]
          end

          def get_date()
            response = @client.request :sys, "getDate" do
              soap.body = {

              }
            end
            response.to_hash[:get_date_response][:date]
          end

        end

      end
    end
  end
end
