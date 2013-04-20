module Sirius
  module Client
    module Win32
      module Core
        class Core
          attr_accessor :button
          attr_accessor :dialog
          attr_accessor :edit
          attr_accessor :listbox
          attr_accessor :menu
          attr_accessor :tabcontrol
          attr_accessor :window

          def initialize(host = 'localhost', port = '21212')
            @button = Button::Button.new("http://#{host}:#{port}/win32/button")
            @dialog = Dialog::Dialog.new("http://#{host}:#{port}/win32/dialog")
            @edit = Edit::Edit.new("http://#{host}:#{port}/win32/edit")
            @listbox =
              Listbox::ListBox.new(
                "http://#{host}:#{port}/win32/listbox")
            @menu = Menu::Menu.new("http://#{host}:#{port}/win32/menu")
            @tabcontrol =
              Tabcontrol::TabControl.new(
                "http://#{host}:#{port}/win32/tabcontrol")
            @window = Window::Window.new("http://#{host}:#{port}/win32/window")
          end
        end
      end
    end
  end
end