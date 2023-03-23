call runcrud
if "%ERRORLEVEL%" == "0" goto runchrome
echo Cannot execute command runcrud
goto fail

:runchrome
start chrome http://localhost:8080/crud/v1/task/tasks
if "%ERRORLEVEL%" == "0" goto end
echo Cannot start chrome
goto fail

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.