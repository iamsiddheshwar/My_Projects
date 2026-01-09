const taskInput = document.getElementById("taskInput");
const dueDateInput = document.getElementById("dueDate");
const priorityInput = document.getElementById("priority");
const addTaskBtn = document.getElementById("addTaskBtn");
const taskList = document.getElementById("taskList");
const filterBtns = document.querySelectorAll(".filters button");

let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

function renderTasks(filter = "all") {
  taskList.innerHTML = "";
  let filteredTasks = tasks.filter(task => {
    if (filter === "completed") return task.completed;
    if (filter === "pending") return !task.completed;
    return true;
  });

  filteredTasks.forEach((task, index) => {
    const li = document.createElement("li");

    const details = document.createElement("div");
    details.className = "task-details";

    const text = document.createElement("span");
    text.className = "task-text";
    if (task.completed) text.classList.add("completed");
    text.textContent = `${task.text} (Due: ${task.dueDate || "N/A"})`;
    text.addEventListener("click", () => toggleTask(index));

    const priority = document.createElement("small");
    priority.textContent = `Priority: ${task.priority}`;
    priority.className = `priority-${task.priority}`;

    details.appendChild(text);
    details.appendChild(priority);

    const actions = document.createElement("div");
    actions.className = "task-actions";

    const editBtn = document.createElement("button");
    editBtn.innerHTML = "✏️";
    editBtn.onclick = () => editTask(index);

    const delBtn = document.createElement("button");
    delBtn.innerHTML = "🗑️";
    delBtn.onclick = () => deleteTask(index);

    actions.appendChild(editBtn);
    actions.appendChild(delBtn);

    li.appendChild(details);
    li.appendChild(actions);

    taskList.appendChild(li);
  });

  localStorage.setItem("tasks", JSON.stringify(tasks));
}

function addTask() {
  const text = taskInput.value.trim();
  const dueDate = dueDateInput.value;
  const priority = priorityInput.value;

  if (!text) return alert("Please enter a task!");

  tasks.push({ text, dueDate, priority, completed: false });
  taskInput.value = "";
  dueDateInput.value = "";
  priorityInput.value = "medium";
  renderTasks();
}

function toggleTask(index) {
  tasks[index].completed = !tasks[index].completed;
  renderTasks(document.querySelector(".filters button.active").dataset.filter);
}

function deleteTask(index) {
  tasks.splice(index, 1);
  renderTasks(document.querySelector(".filters button.active").dataset.filter);
}

function editTask(index) {
  const newText = prompt("Edit task:", tasks[index].text);
  if (newText !== null) {
    tasks[index].text = newText.trim() || tasks[index].text;
    renderTasks(document.querySelector(".filters button.active").dataset.filter);
  }
}

addTaskBtn.addEventListener("click", addTask);

filterBtns.forEach(btn => {
  btn.addEventListener("click", () => {
    filterBtns.forEach(b => b.classList.remove("active"));
    btn.classList.add("active");
    renderTasks(btn.dataset.filter);
  });
});

// Initial render
renderTasks();
