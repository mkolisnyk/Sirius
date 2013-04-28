require 'sirius/internal/InternalServiceDriver.rb'

module Sirius
  module Client
    class InternalClient
      attr_accessor :internal
      def initialize(host = 'localhost', port = '21212')
        @internal = Internal::Internal.new("http://#{host}:#{port}/internal")
      end
    end
  end
end
